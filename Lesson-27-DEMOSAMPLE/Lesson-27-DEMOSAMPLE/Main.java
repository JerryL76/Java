class Main {
    public static void main(String[] args) {
        (new Main()).init();
    }

    void init() {
        String msg = "";
        String encodedMsg = "";
        String decodedMsg = "";

        msg = Input.readFile("Original.txt");
        encodedMsg = encode(msg);
        Input.writeFile("Encode.txt", encodedMsg);

        decodedMsg = decode(encodedMsg);
        Input.writeFile("Decoded.txt", decodedMsg);

    }

    String encode(String txt) {
  
        int half = txt.length() / 2;
        String halfSwap = txt.substring(half) + txt.substring(0, half);


        String pairSwap = "";
        for (int i = 0; i < halfSwap.length(); i += 2) {
            if (i + 1 < halfSwap.length()) {
                pairSwap += halfSwap.charAt(i + 1);
                pairSwap += halfSwap.charAt(i);
            } 
            else {
                pairSwap += halfSwap.charAt(i);
            }
        }



        String arrowSwap = "";
        for (int i = 0; i < pairSwap.length(); i++) {
            char c = pairSwap.charAt(i);
            if (c == 'i' || c == 'I') arrowSwap += '↓';
            else if (c == 'o' || c == 'O') arrowSwap += '↑';
            else if (c == 'a' || c == 'A') arrowSwap += '←';
            else if (c == 'e' || c == 'E') arrowSwap += '→';
            else arrowSwap += c;
        }



        String output = "";
        for (int i = 0; i < arrowSwap.length(); i++) {
            char c = arrowSwap.charAt(i);
            if (Character.isLetter(c)) {
                String bin = Integer.toBinaryString(c);
                while (bin.length() < 8) bin = "0" + bin;
                output += bin;
            } 
            else {
                output += c;
            }
        }

        return output;
    }

    String decode(String txt) {

        String binaryReversed = "";
        for (int i = 0; i < txt.length(); ) {
            char c = txt.charAt(i);

            if (c == '↓' || c == '↑' || c == '←' || c == '→') {
                binaryReversed += c;
                i++;
            } 
            else if (c != '0' && c != '1') {
                binaryReversed += c;
                i++;
            } 
            else {
                if (i + 8 <= txt.length()) {
                    String bits = txt.substring(i, i + 8);
                    boolean ok = true;
                    for (int k = 0; k < bits.length(); k++) {
                        if (bits.charAt(k) != '0' && bits.charAt(k) != '1') {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) {
                        int val = Integer.parseInt(bits, 2);
                        binaryReversed += (char) val;
                        i += 8;
                    } 
                    else {
                        binaryReversed += c;
                        i++;
                    }
                } 
                else{
                    binaryReversed += c;
                    i++;
                }
            }
        }


        String arrowReversed = "";
        for (int i = 0; i < binaryReversed.length(); i++) {
            char c = binaryReversed.charAt(i);
            if (c == '↓') arrowReversed += 'i';
            else if (c == '↑') arrowReversed += 'o';
            else if (c == '←') arrowReversed += 'a';
            else if (c == '→') arrowReversed += 'e';
            else arrowReversed += c;
        }


        String pairUnswap = "";
        for (int i = 0; i < arrowReversed.length(); i += 2) {
            if (i + 1 < arrowReversed.length()) {
                pairUnswap += arrowReversed.charAt(i + 1);
                pairUnswap += arrowReversed.charAt(i);
            } 
            else {
                pairUnswap += arrowReversed.charAt(i);
            }
        }


        int half = pairUnswap.length() / 2;
        String finalOut = pairUnswap.substring(half) + pairUnswap.substring(0, half);

        return finalOut;
    }
}
