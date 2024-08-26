import java.util.Arrays;

public class NamesArray {
    private String[] names;

    public NamesArray() {
        names = new String[0];
    }

    public void addName(String name) {
        String[] newNames = new String[names.length + 1];
        System.arraycopy(names, 0, newNames, 0, names.length);
        newNames[names.length] = name;
        names = newNames;
    }

    public void removeName(String name) {
        String[] newNames = new String[names.length - 1];
        int j = 0;
        for (String s : names) {
            if (!s.equals(name)) {
                newNames[j] = s;
                j++;
            }
        }
        names = newNames;
    }

    public String[] getNames() {
        return names;
    }

    public void clearNames() {
        names = new String[0];
    }

    public void sortNamesAZ() {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].toLowerCase().compareTo(names[j].toLowerCase()) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    public void sortNamesZA() {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].toLowerCase().compareTo(names[j].toLowerCase()) < 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }

    public void invert() {
        for(int i = 0; i < names.length / 2; i++)
        {
            String temp = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = temp;
        }
    }

    public void removeDuplicates() {
        names = Arrays.stream(names).distinct().toArray(String[]::new);
    }

    private String[] removeBlanks(String[] arr) {
        int blackCount = 0;
        for (String s : arr) {
            if (s.isBlank()) {
                blackCount++;
            }
        }

        String[] newArr = new String[arr.length - blackCount];
        int j = 0;
        for (String s : arr) {
            if (!s.isBlank()) {
                newArr[j] = s;
                j++;
            }
        }

        return newArr;
    }

    public void removeEmpty() {
        names = removeBlanks(names);
    }

    public void applyTrim() {
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
        }
    }

    public void toUpperCase() {
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase();
        }
    }

    public void toLowerCase() {
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toLowerCase();
        }
    }

    public void capitalize() {
        for (int i = 0; i < names.length; i++) {
            String[] words = names[i].split(" ");
            StringBuilder newName = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    String firstLetter = word.substring(0, 1).toUpperCase();
                    String rest = word.substring(1).toLowerCase();
                    newName.append(firstLetter).append(rest).append(" ");
                }
            }
            names[i] = newName.toString().trim();
        }
    }
}
