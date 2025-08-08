package com.example.securityApiExample;

public class OptInCodeRequest {
    private String email;
    private String optInCode;

    public OptInCodeRequest(String email, String optInCode) {
        this.email = email;
        this.optInCode = optInCode;
    }

    //Descomente essa seção para ocultar informações pessoais no log com a substituição de valores
    //    @Override
    //    public String toString() {
    //        return "OptInCodeRequest{" +
    //                "email='[PERSONAL - REMOVED]'" +
    //                ", optInCode='[PERSONAL - REMOVED]'" +
    //                '}';
    //    }


    @Override
    public String toString() {
        return "OptInCodeRequest{" +
                "email='" + email + '\'' +
                ", optInCode='" + optInCode + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOptInCode() {
        return optInCode;
    }

    public void setOptInCode(String optInCode) {
        this.optInCode = optInCode;
    }
}
