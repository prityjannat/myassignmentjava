package string_manipulation;

//1. Extract the transaction ID from the HTML body
//<html>
//<title>Test</title>
//<body>
//Your trnx is successful. Trnx Id is: TXN123456
//</body>
//</html>
//        Output: TXN123456

public class Transaction_Id_01 {
    public static void main(String[] args) {
        String str ="<html> <title>Test</title> <body>Your trnx is successful. Trnx Id is: TXN123456 </body> </html>";
        str = str.replaceAll("[^(TXN123456)]"," ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        String output = String.valueOf(arr[2]);
        System.out.println(output);
    }
}


