/* Project of UGC team

======================
Authors:haoji.yu

======================
Description:

balabala here

======================
Major changs:

add by haoji.yu 16/5/4

*/
package com.dianping.dptest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = {
        "classpath*:config/spring/common/appcontext-*.xml",
        "classpath*:config/spring/local/appcontext-*.xml"
})
public abstract class SpringTestNGSupport extends AbstractTestNGSpringContextTests {
}
