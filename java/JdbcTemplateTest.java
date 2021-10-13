import com.dao.AccountDao;
import com.dao.UserDao;
import com.domain.Account;
import com.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {
    @Test
    public void addAccountTest(){
        Account account=new Account();
        account.setUsername("zhangsan");
        account.setBalance(55.00);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.addAccount(account);
    }
    @Test
    public void deleteAccountTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.deleteAccount(3);
    }
    @Test
    public void findAccountByidTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao dao = applicationContext.getBean(AccountDao.class);
        System.out.println(dao.findAccountbyid(1));
    }
    @Test
    public void findAllAccountTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        List<Account> allAccount = accountDao.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }
    @Test
    public void UpdateAccountTest(){
        Account account=new Account();
        account.setUsername("lisi");
        account.setBalance(62.00);
        account.setId(3);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = applicationContext.getBean(AccountDao.class);
        accountDao.updateAccount(account);
    }
    @Test
    public void addUserTest(){
        User user=new User();
        user.setUsername("keke");
        user.setPassword("987");
        user.setSex("女");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.addUser(user);
    }
    @Test
    public void deleteUserTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.deleteUser(2);
    }
    @Test
    public void findUserByidTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao.findUserbyid(1));
    }
    @Test
    public void findAllUserTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        List<User> allUser = userDao.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
    @Test
    public void UpdateUserTest(){
        User user=new User();
        user.setUsername("tql");
        user.setPassword("888");
        user.setSex("男");
        user.setId(2);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.updateUser(user);
    }
    @Test
    public void findUsercount(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        System.out.println(userDao.findusernamecount());
    }
}
