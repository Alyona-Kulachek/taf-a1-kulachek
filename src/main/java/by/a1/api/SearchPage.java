package by.a1.api;

public class SearchPage {

    private String endPoint = "https://www.a1.by/ru/s";
    private String headerValue = "example";
    private String headerKey = "q";
    private String contentTypeValue = "application/json;charset=UTF-8";
    private String headerLimit = "limit";

    public String getEndPoint() {
        return endPoint;
    }

    public String getHeaderValue() {
        return headerValue;
    }

    public String getHeaderKey() {
        return headerKey;
    }

    public String getContentTypeValue() {
        return contentTypeValue;
    }

    public int generateNumber() {
        int number = (int) ((Math.random() * 100) + 1);
        return number;
    }

    public String getHeaderLimit() {
        return headerLimit;
    }
}
