public class StringSearch {
    public static void main(String[] args) {
        String name = "Dikshant Kanela";
        char target = 'c';
        boolean res = search(name,target);
        System.out.println(res);
        boolean res2 = search2(name,target);
        System.out.println(res2);
    }

    static boolean search(String name, char target){
        if(name.length()==0){
            return false;
        }

        for(int ele:name.toCharArray()){
            if(target == ele){
                return true;
            }
        }
        return false;

    }
    static boolean search2(String name, char target){
        if(name.length()==0){
            return false;
        }

        for(int i =0 ; i<name.length();i++){
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
