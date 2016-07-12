/* Project of UGC team

======================
Authors:haoji.yu

======================
Description:

======================
Major changs:

add by haoji.yu 16/5/11

*/
package com.dianping.dptest.mapper;

import com.dianping.dptest.SpringTestNGSupport;
import com.dianping.dptest.entity.Picture;
import com.dianping.dptest.mapper.Picdao;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.unidal.lookup.annotation.Inject;

import java.util.List;

import static java.lang.System.in;

public class PicdaoTest extends SpringTestNGSupport {

    @Autowired
    private Picdao pd;


    @Test
    public void testLoadPic() throws Exception {
        Picture picEntity = pd.getPicById(43L);
        System.out.println(picEntity.getAddTime().toString()+picEntity.getUrl()+picEntity.getPopularity());
        Assert.assertNotNull(picEntity);
        //Assert.assertEquals("e7e5c99566e3b724c5f4548ae56be390", reviewPicEntity.getUrl());
    }

    @Test
    public void testLoadUserPicList() throws Exception {
        List<Picture> pics = pd.getPicByUserId(3L);
        for(Picture pic : pics){
            System.out.println(pic.getTitle());
        }

        Assert.assertNotNull(pics);
    }

}
