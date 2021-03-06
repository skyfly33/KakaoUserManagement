package com.devarchi.users;

import com.devarchi.users.config.KakaoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


/**
 * Created by donghoon on 2016. 1. 4..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {KakaoConfig.class})
public class KakaoPropertiesTest {

    @Autowired
    private KakaoPropertyProvider kp;

    @Test
    public void getKakaoProperties() {
        String key = kp.getKakaoRestKey();
        String kakaoLoginCodeUrl = kp.getKakaoLoginCodeUrl();
        String redirectUri = kp.getRedirectUri();
        System.out.println();
        System.out.println("Rest Key: " + key);
        System.out.println("kakaoLoginCodeUrl: " + kakaoLoginCodeUrl);
        System.out.println("redirect.uri: " + redirectUri);
        assertEquals("2755f44859a95fb5e2ebd4aa9de67f4b", key);
        assertEquals("https://kauth.kakao.com/oauth/authorize", kakaoLoginCodeUrl);
        assertEquals("localhost:8080", redirectUri);
    }
}
