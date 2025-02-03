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

        public int getLines(){
            String newStr = "";
            int findLast = 0;
            for (int i = 0; i <= length; i += length){
                if (findLast - 1 == numberOfLines()){
                    newStr += message.substring(i);
                }
                else{
                    newStr += message.substring(i, i + length);
                    newStr += ";";
                    findLast++;
                }
            }
            return findLast;
        }
} 