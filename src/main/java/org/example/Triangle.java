package org.example;

public class Triangle {

    public String Check(int a, int b, int c){
        String Triangle = "La tam giac";
        String NotTriangle = "Khong la tam giac";
        String NotValid = "Khong hop le";

        if(a<0||b<0||c<0) {
            return NotValid;
        } else {
            if (a + b < c || b + c < a || c + a < b) {
                return NotTriangle;
            }
        }
        return Triangle;
    }
}
