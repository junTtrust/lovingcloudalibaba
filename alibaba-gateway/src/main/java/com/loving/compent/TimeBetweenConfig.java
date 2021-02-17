package com.loving.compent;

import lombok.Data;

import java.time.LocalTime;

/**
 * @Author: yijunjun
 * @Date: 2021/2/17 10:34
 */
@Data
public class TimeBetweenConfig {
    private LocalTime startTime;

    private LocalTime endTime;
}
