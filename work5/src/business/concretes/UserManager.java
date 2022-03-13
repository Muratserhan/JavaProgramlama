package business.concretes;

import eTrade.business.abstracts.UserCheckService;
import eTrade.business.abstracts.UserService;
import eTrade.business.abstracts.VerificationService;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class UserManager implements UserService {
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	private UserDao userDao;

	public UserManager(UserCheckService userCheckService, VerificationService verificationService, UserDao userDao) {

		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		if (userCheckService.checkFirstName(user) && userCheckService.checkLastname(user)
				&& userCheckService.checkEmail(user) && userCheckService.checkPassword(user) == true) {
			verificationService.sendVerifyMail(user.geteMail());
			userDao.add(user);
		}

	}

	@Override
	public void singIn(User user) {
		verificationService.checkVerifyAccount(user.geteMail());

		if (userDao.getEmail(user.geteMail()) && userDao.getPassword(user.getPassword())
				&& verificationService.checkVerifyAccount(user.geteMail()) == true) {
			System.out.println("Kullanici girisi basarili.");

		} else if (verificationService.checkVerifyAccount(user.geteMail()) == false) {
			System.out.println("Kullanici bilgileri dogru ama mail adresi yanlıs.");
		} else {
			System.out.println("Kullanici bilgileri yanlıs.");
		}

	}

}