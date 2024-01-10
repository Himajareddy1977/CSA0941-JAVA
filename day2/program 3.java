class daddy{
    void dis(int i){
        System.out.println(i);
    }
}
class derived extends daddy{
    void dis(double i){
        System.out.println(i);
    }
}
class base {
    public static void main(String[] args) {
        derived d = new derived();
        d.dis(9);
    }
}
