package com.zcf.pay.AliPays;

/**
 * 支付宝支付所需的必要参数 理想情况下只需配置此处
 */
public class ALiPayConfig {
	// 合作身份者ID，以2088开头由16位纯数字组成的字符串
	public static String partner = "2088431310717610";
//	public static String partner = "2088102177574060";

	// appid
//	public static String appid = "2018071960697512";
	public static String appid = "2019022663408158";

	// 商户支付宝账号
//	public static String seller_email = "xuzhouzaichufa@126.com";
	public static String seller_email = "shixin20181128@163.com";

	// 商户真实姓名
//	public static String account_name = "江苏省徐州市再出发网络科技有限公司";
	public static String account_name = "苏州世歆信息技术有限公司"; 

	// URL
	public static String url = "https://openapi.alipaydev.com/gateway.do";
	public static String timeoutExpress = "1000";

	// 商户的私钥RSA
//	public static String private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCJBZ5f513t1fsJbWGoxsyPDMuye8KkXyQ1WcCBCyAT7Kin3SrULK/01AD/M12BxHXgh364Me1m7iON8YTepJeNAixMeIxrjAelXhudjccYnvLUC7izr6/EOin3Dh30OS2Mrp4JUdF8OOd9/93fqwrxuvTV0nkDkNc0GpJyBU9MU8rypVxuaMBV0lCFiBhfMQ/XeZ5TLsZ0jztyLzcrWse198VsEQbJ/skLNTllen76dQH/kw3AQ9j2pFgeavUJOEZFdpzhWVykpsQdKwR0a4M65BbmxzbKk3KmU9779613npS7Nthp9Oa0fWYBGeel8WoBMMhFX264i6vadAEAGpPVAgMBAAECggEADjVy8ub/Koah/ZxGIEZdOAhPpzaGPJ1RF+cyuy74KJjF9IJOyqnHpU/GurAM5kQFJT9nuJoU0DOppDKDYMMYpBqxlUx64zwmHtPfcTsehkMVUz/T624wf9y4NVJVcNntC0WgRb8iRgtwlfROgb8u51pHwVSOD/yZFGIdBY3fZz6yP/RnHts8Zy24vl4ZOnMxs9w6lmx/rQzM7W7e/6dYQN56cMBuYpe4DMT1lpEasD1py6j8yQKtrYyskl8djMtqKydKUfvzAuIiTB8H1kWtU5sOTJ1DxhRzoqfqLENCJt81W6bfE3LapVzcUTnBLWmfT07ErcaQqOQkOVIaqyNBgQKBgQDJD83uSmYw8xYCTK/79ShyXsDJibXpcFsy0aobGSDXXuhwyrK+rQZ74Sp8lfKfnOXPUS6ku9icQLtHoy0uGj3TA3bQcF6WxqnN/cMT/bXdEuxEIefsurEQvb+qHei5p+j5qY2A9b4SHmD7eoowv7xoFtGwVnyDeK5EfFCITt+DPQKBgQCudkEW7Tm8WNyNp1V9R1yv48fOgmMWNx00/hkO3gD8iW8JUieeVkxuJOGDkkEoZKMpTH+D6cTwdaIqlZ8eBzNx9KWjaMHuJE+jd4CAT6CRxDSgANuoj6ZZM+8vIo/905Nkt7Lh1q8kb9uP0J3JnVMdmuLvrpNrpYqj4n7uxrR8eQKBgQDEjUmwUFT0Nz7lwpgrhC8lF1H580C9UxQkauiTEw6S3Hn4gX8ZfcYf5i+FmYSU2mmiMOebLPOFVJaAYplxPz/+/5zwCVm+pbkr4Y4KBfT6iFwmAstaFeuwxP4QTKrMi8PqBQGK9zD3P3FphhJ/s4B4dQ5KB1IzqA8cbja/+fLwtQKBgQCfSHJW91HeR5decWeZEN1r7WBQiDTlZH5zEodYTpLB/sx0yyBG7O2tJlkLIi4BLhjVrPVDP9zB2fSsQpza8qIiqcXM8ukUfuyDB6k3/PtR+rw9VWs3c6fiC4uWEk065r/MlfdpP/P6JXJl1IcrO0tWXUJSqKYKA0MYK8POR3cjqQKBgQC5wJrarFXio5qmYNqF/HePl1kgtsTeQ7j8c1Qz73OEKeOmwQbslqxUotV2QUmseM0+bStWCkC3m6ue9LkMu8ik4cEIIAoKO4yDJKsp/PLxxUoxLDyq5uEIh2Z9BRZaoR3V9bV4O2YleqWF/IBywvcU8eTrxcw1jrzL+sC62GAItw==";
	public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCIUwPyUQl6CHV+TUB6WlvlhXQ4qP+gotmrbVB1nYHPInxY/2xWkz9PHbCD+BRcPh1w2YONRsWGWTALlrvURcCSWOD18FkH0/M2HKh/etzbbYyzLz+eSu2GwtnDKC1ALAd6BoeD/aVcY2m0B5ZLkwaSDg8hRbis1bamH3MTSu4HiWjFl926YB5XlkSLSQ7Mjf1Wx26iHlZk8dClPWQJii61g1B6wD03OxaA9fvPabHNq/+dY7FRuQLwv8ril8obDH6nvF2C28kzsZO9T0wjeTcKLS10/0jZK8zT9RbKKHF+4Gqmxp5oCwT0l6MVKUjgZU7lYxRMi4uP3uUivg96b8pTAgMBAAECggEARavXuoH8C+hC1Bf7OgzwJm98JHEKpDhWcqxdkJ689vWzA3EXF3ANzQtpaSjijvoX5dLkztE6phzy1xlkSWqUrrbJ0ifR+JQ0GpWu7+gE9Aga/oDJTMcSeesfjAP+jGt0LsMjgyug1YThQucVwu4TT5Xr2Z9ecMaQoHo2P8ftut+ZMdRCkTzlSxhlp7F5zEEGVHBXB3S4ZD19ZfVyOvSyhPGA6tLAFJYMAVt5xmwuk5+iLczZU3BTDrhPrD52vVY4+d+MDFMEuEntcX0jJKd6zJu1JnaFnzQUnqiiuIGRss5aYQwebVZoBBCrUz7SZ27tKLry7ZTMvmDx8oZE9HyuoQKBgQDPdardNcBhdlTnJq1e9ipEzI1jMEl2h7AE7ihkhhkeUnLUE5oHHQL5MQfeS3FWn0nb6mX7ioQLloKjGMW9CAW+Mlq2CwE4kRPKC9C+j4Mhg6TOpsAdydi0LXHZKOhiZbQm4411N63KBzy2RCHZ2Gbl5cxGCOAUMNSJUmQbq80CywKBgQCoOILliqK27wAGfVUwtAUEhF3w6L7owOrGBIAzGgkPVb/1bBbbYhgxMGIVfbATJ03fDXpsLB1UbEQrOTnmGIG+PcQNhUhEVMnr6JjbIIeNiamaybGllPHQxL1Jot5NKG2inmj3GYz1giWgVvd2UiM3D4RAMHER8ADFicHrKiR9mQKBgQCw7mSjtpT1SitM3GKeC4mvFVk8D9GHgl9vRQI0AV3oy15dWr5RdL+1cMiKIINv4ffm07jYV6EYFOwjVxxFhFMJi/5rJWWMLcbX2U3VR6YJbjGfgP12KlBkEiH3l/jg+mYziHx7TNot5BA2TlMkbHgNd/fIfwdEkQSifR8drl7xEwKBgCgprd7d9bFVaJ0kCVXidRw5+i/Ncd8iSCtU4cLRoX4ezADteJuSVRJRaemVo5c/GBF8J1FySuJgIvpq5E7yZO+l0Ywk2TcvQzJmyy/uGU8KogrJwvc0k3NztXnCP+8OCvb7eTYdzJDFLPSWLuj5/VxlAP9OUYCl25lOJZVe721pAoGAHV1yYjojl/nZ1juNQ1MR7kYwvv255fXImVjkV/H5hnmTGy6S7chLFzoSNVsGIxVo7SFh9t60OVZfmrrcF1kEhYm3WoPyYw4bksAUCgXgYRzjbvNN0bqcK3sFZOzY1BOJQSJgxLOI/YKdhA2VhR95DoohCaBG+pLXmL1G/GDrj9c=";
	// 支付宝的公钥 RSA
//	public static String ali_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArqoTa6tSlY5H1O6HTbqruMeNpS7RwlrJy5+1+zXG6uTCe6VWOLO2xPeXpSbJBeY5FBJ3LlqTgIixr3VJthA0IF+1ChaY6ZYDKkBA3cbzQWemPGoYOifTHvzigzThVPCp2WnvLtCQIDVW40kRy/HNkNQGmZldtF1/4owwATJm4ChvH6e72izyQkK7NsYYxsaxE6P6biLiaPH2MR4kv4emGxIxfRfUp0CELolxNStgAONvO4m/HxyCO34DtnIJuz3DavJAdCldZLXWY2zGz/RnGsYsmdDDN8MKGL5vIKSVEqbLrJx7sJW0BqHEnL15DBQcNArHgSblelp/89GrA0Z+QQIDAQAB"; // 签名方式
	public static String ali_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApUaanK+85H3I+z2Y2akmq3k+7eK0TVmKCzBJ2NkkkqkA3Wx0+0xOFyfP7Lf32syfqbJL31NJsdHdiwCY19TwgpVQNMmxVBIqMTGy20VtcWRrNO+ycNGjYIBiV/70fL4jRHJN0neAq+5RZcVFEKMssjOBGhHPdWlvAXf9NirLvFWndeqeR6tVT1DSyrHDC1SFXETtyh8RS0RH7eAKxpNZxqUwV1ebSHU9yXrlxgLr5lVbFg6o2MyCAvfhMG8xRPtdDN1ENCgsNO+mMu9SCT+FKbwZc1S4AY3NrohOwdQeTtLhc+A/Y05dAwndLtD0zLo6FaYhAmmuvrnOMuKXMoXM0wIDAQAB"; // 签名方式
																																																																																																														// (支付回调签名方式)
	public static String pay_sign_type = "RSA2";

	/**
	 * 支付宝服务器主动通知商户服务器里指定的页面http/https路径。建议商户使用https
	 * 这里需要测试的话，需要用外网测试。https://www.ngrok.cc/ 这里有免费和付费的，实际上，免费用一下就可以了。
	 */
	public static String notify_url = "	http://47.100.110.119:9621/run/Alipay/notify_url";
	// 商品的标题/交易标题/订单标题/订单关键字等。
	public static String subject = "商品购买";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	// 接口名称 固定为：alipay.trade.app.pay
	public static String method = "alipay.trade.app.pay";

	// 调用的接口版本，固定为：1.0
	public static String version = "1.0";

	// 销售产品码，商家和支付宝签约的产品码，为固定值QUICK_MSECURITY_PAY
	public static String product_code = "QUICK_MSECURITY_PAY";

	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";

}
