import java.util.*;
public class WordReverse implements ICrypto{
  private static WordReverse instance;
  public static WordReverse getInstance() {
		if (instance == null)
			instance = new WordReverse();

			return instance;
	}

  public String encrypt(String message){
    String[] split = message.split(" ");
    String wordSwap = "";
    for(int i = split.length-1; i > 0; i--){
      wordSwap =  wordSwap + split[i] + " ";
    }
    return new StringBuilder(wordSwap).reverse().toString();
  }
  public String decrypt(String message){
    String[] split =  new StringBuilder(message).reverse().toString().split(" ");
    String wordSwap = "";
    for(int i = split.length-1; i > 0; i--){
      wordSwap = wordSwap + split[i] + " ";
    }
    return wordSwap;
  }
}
