package me.chanjar.weixin.common.bean;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
@Slf4j
public class WxAccessTokenTest {

  public void testFromJson() {

    String json = "{\"access_token\":\"ACCESS_TOKEN\",\"expires_in\":7200}";
    WxAccessToken wxError = WxAccessToken.fromJson(json);
    log.info("实体对象:{}", wxError);
    Assert.assertEquals(wxError.getAccessToken(), "ACCESS_TOKEN");
    Assert.assertTrue(wxError.getExpiresIn() == 7200);
  }
}
