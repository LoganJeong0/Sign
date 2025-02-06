public class Sign
    {
        private String message;
        private int length;
        public Sign(String str, int num){
            message = str;
            length = num;
        }

        public int numberOfLines(){
            int amount = 0;
            if (message.length() % length == 0){
                amount = (message.length() / length);
        }
            else{
                amount = (message.length() / length) + 1;
            }
            return amount;

        }

        public String getLines(){
            String newStr = "";
            for (int i = 0; i < message.length(); i += length){
                if (i + length > message.length() - 1){
                    newStr += message.substring(i);
                }
                else{
                    newStr += message.substring(i, i+length);
                    newStr += ";";
                }
            }      
            return newStr;
        }
}
