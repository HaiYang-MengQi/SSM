import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClass {
}
class UDPSender{
    public static void main(String[] args) throws Exception {
        DatagramSocket client = new DatagramSocket(3000);
        String str = new String("hello");
        DatagramPacket clientPacket = new DatagramPacket(str.getBytes(), 0,str.getBytes("UTF-8").length);
        System.out.println("正在发送中!");
        client.send(clientPacket);
        client.close();

        DatagramSocket server = new DatagramSocket(8900);
        byte[] data = new byte[1024];
        DatagramPacket p = new DatagramPacket(data, 0, data.length);
        System.out.println("等待接收数据");
        while (true){
            server.receive(p);
            String str1 = new String(p.getData(),0,p.getData().length);
            System.out.println(str1);
        }

    }
}
