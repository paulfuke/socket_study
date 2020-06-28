package com.dongpo;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @className AddressTest
 * @Description: InetAddress测试
 * @Author dongpo
 * @Date 2020/6/28
 * @Version V1.0
 **/
public class AddressTest {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("ip: "+localHost.getHostAddress());
            System.out.println("主机名："+localHost.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
