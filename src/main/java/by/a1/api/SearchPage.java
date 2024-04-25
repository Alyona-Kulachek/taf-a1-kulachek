package by.a1.api;

public class SearchPage {

    private String endPoint = "https://www.a1.by/ru/s";
    private String HeaderValue = "example";
    private String HeaderKey = "q";
    private String contentTypeValue = "application/json;charset=UTF-8";
    private String HeaderLimit = "limit";

    public String getEndPoint() {
        return endPoint;
    }

    public String getHeaderValue() {
        return HeaderValue;
    }

    public String getHeaderKey() {
        return HeaderKey;
    }

    public String getContentTypeValue() {
        return contentTypeValue;
    }

    public int generateRandomNumber() {
        int number = (int) ((Math.random() * 100) + 1);
        return number;
    }

    public String getHeaderLimit() {
        return HeaderLimit;
    }
}
