package com.huang.typpchat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId; //用户id
    private String userPwd; //用户密码
    private String nickName;  //用户昵称
    private Integer userSex; //用户性别
    private Integer userAge; //用户年龄
    private String profileHead; //头像
    private String userIntro; //简介
    private String regTime; //注册时间
    private String lastLogin; //最后登录时间
    private Integer userStatus; //状态（1，正常  0，禁用）
}
