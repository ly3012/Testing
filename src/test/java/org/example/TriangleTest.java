package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 class TriangleTest {
    Triangle triangle = new Triangle();
    String Triangle = "La tam giac";
    String NotTriangle = "Khong la tam giac";
    String NotValid = "Khong hop le";

    @Test
    void test1(){
        assertEquals(triangle.Check(4,5,6),Triangle);
    }
    @Test
    void test2(){
        assertEquals(triangle.Check(2,6,3),NotTriangle);
    }
    @Test
    void test3(){
        assertEquals(triangle.Check(8,4,2),NotTriangle);
    }
    @Test
    void test4(){
        assertEquals(triangle.Check(3,4,8),NotTriangle);

    }
    @Test
    void test5(){
        assertEquals(triangle.Check(4,5,-2),NotValid);
    }
    @Test
    void test6(){
        assertEquals(triangle.Check(5,-5,5),NotValid);
    }
    @Test
    void test7(){
        assertEquals(triangle.Check(-3,-4,-5),NotValid);
    }
}