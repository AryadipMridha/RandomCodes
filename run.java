public class run {
public static void main(String[] args) {
String arr[] = new String[10];
int pointer = 0;
for (int valueToPlace = 1; valueToPlace <= arr.length; valueToPlace++) {
for (int x = 1; x <= valueToPlace; x++) {
if (pointer == arr.length - 1)
pointer = 0;
else
pointer++;
if (arr[pointer] != null)
x--;
}
System.out.println("Placing " + valueToPlace + " at index " + pointer);
arr[pointer] = valueToPlace + "";
while (arr[pointer] != null && valueToPlace != arr.length) {
if (pointer == arr.length - 1)
pointer = 0;
else
pointer++;
}
}

for (String str : arr) {
System.out.print(str + ", ");
}
}
}