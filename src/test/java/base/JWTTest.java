package base;

public class JWTTest {
    @Test(description = "Create Token",dataProvider = "testData")
    void createToken() {
        try {
            // Các thông tin cần thiết
            String clientId = "3MVG9NquH_V0WE8HE0rMH5l6cmYUneRcBD_JhMKPwYk6src2nF1iPssqoWkT0VyQnmuFn0abv_caCVlIEvGN3";  // Client ID (Consumer Key)
            String userId = "005Az000008IUnCIAW";  // User ID (Subject)
            String audience = "https://test.salesforce.com";  // OAuth endpoint cho Sandbox (hoặc https://login.salesforce.com cho Production)
            String privateKeyPath = "server_pkcs8.key";  // Đường dẫn đến private key của bạn

            // Tạo JWT token
            String jwtToken = JWTUtils.createJWT(clientId, userId, audience, privateKeyPath);
            System.out.println("JWT Token: " + jwtToken);
            Assert.notEquals("", jwtToken);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

