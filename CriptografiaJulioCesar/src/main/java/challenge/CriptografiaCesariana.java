package challenge;

public class CriptografiaCesariana implements Criptografia {

  @Override
  public String criptografar(String message) {
    return cryptography(message, 3);
  }

  @Override
  public String descriptografar(String message) {
    return cryptography(message, -3);
  }

  private String cryptography(String message, int value) {
    if (message.isEmpty()) {
      throw new IllegalArgumentException("The message is empty");
    }

    message = message.toLowerCase();
    StringBuilder newMessage = new StringBuilder();

    for (int i = 0; i < message.length(); i++) {
      if (((int) message.charAt(i)) < 97 || ((int) message.charAt(i)) > 122) {
        newMessage.append(message.charAt(i));
      } else {
        if (((int) message.charAt(i) + value) > 122)
          newMessage.append((char) (message.charAt(i) + value - 25));
        else if (((int) message.charAt(i) + value) < 97)
          newMessage.append((char) (message.charAt(i) + value + 26));
        else {
          newMessage.append((char) (message.charAt(i) + value));
        }
      }
    }
    System.out.println(newMessage.toString().toLowerCase());
    return newMessage.toString().toLowerCase();
  }
}