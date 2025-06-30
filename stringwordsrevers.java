public class stringwordsrevers{
    public static void main(String args[]){
     String Sentence = "My nsme is sachin";
     String []word = Sentence.split(" ");
     StringBuilder reversedSentence = new StringBuilder();
     for(int i = word.length-1; i>=0; i--){

        reversedSentence.append(word[i]);
        if(i != 0){

            reversedSentence.append(" ");

        }
     }

     System.out.println(reversedSentence.toString());
        
    }

}