import java.io.IOException;
import java.net.InetAddress;

public class InetAddressClass {


    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getAddress());
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println(address.isReachable(1000));
        System.out.println(address.getLocalHost());
    }
}
