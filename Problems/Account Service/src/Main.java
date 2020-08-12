interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService{
    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        Account requiredAccount = null;
        for (int i = 0; i < getAccounts().length; i ++) {
            if (getAccounts()[i].getOwner().getId() == id) {
                requiredAccount = getAccounts()[i];
                break;
            }
        }
        return requiredAccount ;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long countAccount = 0;
        for (int i = 0; i < getAccounts().length; i ++) {
            if (getAccounts()[i].getBalance() > value) {
                countAccount++;
            }
        }
        return countAccount ;
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() { 
        return id; 
    }

    public long getBalance() { 
        return balance; 
    }

    public User getOwner() { 
        return owner; 
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() { 
        return id; 
    }

    public String getFirstName() { 
        return firstName; 
    }

    public String getLastName() { 
        return lastName; 
    }
}
