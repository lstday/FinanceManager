import java.util.Set;

/**
 * Created by eliseev on 06.10.15.
 */
public class DataStoreImplemented implements DataStore {
    @Override
    public User getUser(String name) {
        return null;
    }

    @Override
    public Set<String> getUserNames() {
        return null;
    }

    @Override
    public Set<Account> getAccounts(User owner) {
        return null;
    }

    @Override
    public Set<Record> getRecords(Account account) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void addAccount(User user, Account account) {

    }

    @Override
    public void addRecord(Account account, Record record) {

    }

    @Override
    public User removeUser(String name) {
        return null;
    }

    @Override
    public Account removeAccount(User owner, Account account) {
        return null;
    }

    @Override
    public Record removeRecord(Account from, Record record) {
        return null;
    }
}
