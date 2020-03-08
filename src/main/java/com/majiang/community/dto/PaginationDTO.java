package com.majiang.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private Integer totalPage;
    private List<Integer> pages = new ArrayList<>();

    public void setPagination(Integer totalcount, Integer page, Integer size) {
        this.page = page;
        //定义总页数
        if (totalcount/size == 0){
//            10/5 共两页
            totalPage = totalcount/size;
        }else{
//            11/5 余 1 页数加一 共三页
            totalPage = totalcount/size+1;
        }
        if (page<1){
            page=1;
        }
        if (page>totalPage){
            page=totalPage;
        }

        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page-i>0){
                pages.add(0,page-i);
            }
            if (page+i<=totalPage){
                pages.add(page+i);
            }
        }
//        是否展示上一页
        if (page==1){
            showPrevious = false;
        }else{
            showPrevious = true;
        }
//        是否展示下一页
        if (page==totalPage){
            showNext = false;
        }else{
            showNext = true;
        }
//        是否展示首页
        if(pages.contains(1)){
            showFirstPage = false;
        }else{
            showFirstPage = true;
        }
//        是否展示尾页
        if (pages.contains(totalPage)){
            showEndPage = false;
        }else{
            showEndPage = true;
        }
    }
}
