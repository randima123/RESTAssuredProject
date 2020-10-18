package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"status", "data", "message"})
public class EmployeeCreateResponse {

    private String status;
    private Employee data;
    private String message;

    public EmployeeCreateResponse() {
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("data")
    public Employee getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Employee data) {
        this.data = data;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "EmployeeCreateResponse{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
