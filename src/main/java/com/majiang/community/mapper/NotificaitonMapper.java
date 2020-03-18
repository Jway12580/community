package com.majiang.community.mapper;

import com.majiang.community.model.Notificaiton;
import com.majiang.community.model.NotificaitonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NotificaitonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    long countByExample(NotificaitonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int deleteByExample(NotificaitonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int insert(Notificaiton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int insertSelective(Notificaiton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    List<Notificaiton> selectByExampleWithRowbounds(NotificaitonExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    List<Notificaiton> selectByExample(NotificaitonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    Notificaiton selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") Notificaiton record, @Param("example") NotificaitonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int updateByExample(@Param("record") Notificaiton record, @Param("example") NotificaitonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int updateByPrimaryKeySelective(Notificaiton record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATION
     *
     * @mbg.generated Tue Mar 17 22:25:22 CST 2020
     */
    int updateByPrimaryKey(Notificaiton record);
}