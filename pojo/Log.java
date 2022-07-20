package com.huang.typpchat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    private String logId; //日志编号
    private String userId; //用户名
    private String logTime; //时间
    private String logType; //类型
    private String logDetail; //详情
    private String logIp; //ip
    private String hh;
    private String ss;
}
