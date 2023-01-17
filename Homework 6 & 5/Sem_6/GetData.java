import java.util.HashMap;

public class GetData {
    public static void display(String c, HashMap<String, Laptop> storage) {
        for (HashMap.Entry<String, Laptop> set :
                storage.entrySet()) {

            if (c.equals("1")) {
                if (set.getValue().getScreenSize() < 14) {
                    System.out.printf("%s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            }
            if (c.equals("2")) {
                if (set.getValue().getScreenSize() < 15.6 && set.getValue().getScreenSize() >= 14) {
                    System.out.printf("%s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            }
            if (c.equals("3")) {
                if (set.getValue().getScreenSize() < 17.3 && set.getValue().getScreenSize() >= 15.6) {
                    System.out.printf("%s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            }
            if (c.equals("4")) {
                if (set.getValue().getScreenSize() >= 17.3) {
                    System.out.printf("%s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            }
        }
    }

    public static void color(String c, HashMap<String, Laptop> storage) {
        for (HashMap.Entry<String, Laptop> set :
                storage.entrySet()) {

            if (c.equals("1")) {
                if (set.getValue().getColor().contains("Black")) {
                    System.out.printf("%s / \tColor: %s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getColor(), set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            } else if (c.equals("2")) {
                if (set.getValue().getColor().contains("Gray")) {
                    System.out.printf("%s / \tColor: %s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getColor(), set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            } else if (c.equals("3")) {
                if (set.getValue().getColor().contains("Silver")) {
                    System.out.printf("%s / \tColor: %s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getColor(), set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            } else if (c.equals("4")) {
                if (!set.getValue().getColor().contains("Black") &&
                        !set.getValue().getColor().contains("Gray") &&
                        !set.getValue().getColor().contains("Silver")) {
                    System.out.printf("%s / \tColor: %s / \tDisplay: %.1f Inches / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getColor(), set.getValue().getScreenSize(), set.getValue().getPrice());
                }
            }

        }
    }

    public static void cpuType(String c, HashMap<String, Laptop> storage) {
        for (HashMap.Entry<String, Laptop> set :
                storage.entrySet()) {

            if (c.equals("1")) {
                if (set.getValue().getCpu().contains("Core")) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            } else if (c.equals("2")) {
                if (set.getValue().getCpu().contains("Celeron")) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            } else if (c.equals("3")) {
                if (set.getValue().getCpu().contains("Ryzen")) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            } else if (c.equals("4")) {
                if (!set.getValue().getCpu().contains("Core") &&
                        !set.getValue().getCpu().contains("Celeron") &&
                        !set.getValue().getCpu().contains("Ryzen")) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            }

        }
    }

    public static void price(String c, HashMap<String, Laptop> storage) {
        for (HashMap.Entry<String, Laptop> set :
                storage.entrySet()) {

            if (c.equals("1")) {
                if (set.getValue().getPrice() < 300) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            } else if (c.equals("2")) {
                if (set.getValue().getPrice() < 600 && set.getValue().getPrice() >= 300) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            } else if (c.equals("3")) {
                if (set.getValue().getPrice() < 1000 && set.getValue().getPrice() >= 600) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            } else if (c.equals("4")) {
                if (set.getValue().getPrice() >= 1000) {
                    System.out.printf("%s / \tCPU: %s / \tRAM: %d  / \tHDD: %d  / \tPrice: %d$\n", set.getValue().getModel(),
                            set.getValue().getCpu(), set.getValue().getRam(), set.getValue().getHdd(), set.getValue().getPrice());
                }
            }

        }
    }
}
