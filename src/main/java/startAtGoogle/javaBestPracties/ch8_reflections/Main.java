package startAtGoogle.javaBestPracties.ch8_reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class Main {

    public static Optional<Object> getNewInstanceFromObject(Object obj) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clz = obj.getClass();
        System.out.println(clz);

        try {
            Constructor<?> constructor = clz.getConstructor(String.class);
            Object newObj = constructor.newInstance("random string");
            return  Optional.of(newObj);
        } catch (NoSuchMethodException e) {
            return Optional.empty();

        } catch(InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("failed to instaniate constructor ", e);
        }

    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User("ana");
        Optional<Object> newUser = getNewInstanceFromObject(user);
        System.out.println("user - " + newUser.isPresent() + " - " + newUser);

        Player player = new Player(1, 10);
        Optional<Object> newPlayer = getNewInstanceFromObject(player);
        System.out.println("player - " + newPlayer.isPresent() + " - " + newPlayer);
    }
}
