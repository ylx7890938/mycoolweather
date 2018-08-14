package com.huiqiao.ymm.mycoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 创建时间 2018/08/14 16:48
 * 包名： com.huiqiao.ymm.mycoolweather.db
 *
 * @author ymou
 *         描述：
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int countyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }
}