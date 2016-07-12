package com.dianping.dptest.mapper;

import com.dianping.dptest.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixia on 16/7/8.
 */

public interface Picdao{

    /**
     * @param
     * @return
     */
    Picture getPicById(@Param("picId") long picId);


    List<Picture> getPicByUserId(@Param("userId") long userid);
}

