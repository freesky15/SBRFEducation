package SberbankEducation.Practics;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task4_3 {
    public <T> Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<T>(collection);
    }

}
