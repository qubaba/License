package com.qubaba;

/**
 * @ClassName s
 * @Description TODO
 * @Auth qp
 * @Date 2018/7/23 21:41
 */

public class licenseCreateTest {
    public static void main(String[] args){
        CreateLicense cLicense = new CreateLicense();
        //获取参数
        cLicense.setParam("/param.properties");
        //生成证书
        cLicense.create();
    }
}