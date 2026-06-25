//package Marvellous;

class Program440 {
  public int Capital(String str) {
    int i = 0;
    int count = 0;
    char arr[] = str.toCharArray();
    for (i = 0; i < arr.length; i++) {
      if (arr[i] >= 'A' || arr[i] <= 'Z') {
        count++;
      }
    }
    return count;
  }

  public int Small(String str) {
    int i = 0;
    int count = 0;
    char arr[] = str.toCharArray();
    for (i = 0; i < 
      arr.length; i++) {
      if (arr[i] >= 'a' || arr[i] <= 'z') {
        count++;
      }
    }
    return count;
  }

  public int Digit(String str) {
    int i = 0;
    int count = 0;
    char arr[] = str.toCharArray();
    for (i = 0; i < arr.length; i++) {
      if (arr[i] >= '0' || arr[i] <= '9') {
        count++;
      }
    }
    return count;
  }

  public int Space(String str) {
    int i = 0;
    int count = 0;
    char arr[] = str.toCharArray();
    for (i = 0; i < arr.length; i++) {
      if (arr[i] == ' ') {
        count++;
      }
    }
    return count;
  }

  public int Special(String str) {
    int i = 0;
    int count = 0;
    char arr[] = str.toCharArray();
    for (i = 0; i < arr.length; i++) {
      if (arr[i] == '~' || arr[i] == '@' || arr[i] == '#' || arr[i] == '$' || arr[i] == '%' || arr[i] == '^'
          || arr[i] == '&' || arr[i] == '*') {
        count++;
      }
    }
    return count;
  }

}
