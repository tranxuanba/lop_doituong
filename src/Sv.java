 public class Sv {
        public int id = 10;
        public String name = "bon";
        void nhapThongTin(int id, String name) {
            this.id = id;
            this.name = name;
        }
        void inThongTin() {
            System.out.println(id + " " + name);
        }
        public static void main(String args[]) {
            Sv sv1 = new Sv();
            Sv sv2 = new Sv();
            sv1.nhapThongTin(1, "mot");
            sv2.nhapThongTin(2, "hai");
            sv1.inThongTin();
            sv2.inThongTin();

        }

    }
