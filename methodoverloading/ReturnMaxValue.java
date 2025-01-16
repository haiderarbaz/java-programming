

class ReturnMaxValuee{
    public int max(int x, int y){
        return x>y ? x:y;
    }
    public float max(float x, float y){
        return x>y ? x:y;
    }
    public int max(int x, int y, int z){
        return x>y && y>z ? x:(y>z?y:z);
    }
}

public class ReturnMaxValue {
    public static void main(String[] args) {

        ReturnMaxValuee ret=new ReturnMaxValuee();

        int r1=ret.max(4,5);
        System.out.println(r1);
        float r2=ret.max(7.6f, 8.7f);
        System.out.println(r2);
        int r3=ret.max(11, 10, 9);
        System.out.println(r3);

    }
}
