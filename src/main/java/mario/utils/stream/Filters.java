package mario.utils.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {

    public void checkFilter(){



        Structure a = new Structure(1, "one");
        Structure b = new Structure(2, "two");
        List<Structure> structures = new ArrayList<>();

        structures.add(a);
        structures.add(b);


        List<Structure> collect = structures.stream()
                .filter(structure -> structure.id > 1)
                .collect(Collectors.toList());


        System.out.println(collect.size());
    }


    public class Structure {

        int id;
        String value;

        public Structure(int id, String value) {
            this.id = id;
            this.value = value;
        }
    }
}
