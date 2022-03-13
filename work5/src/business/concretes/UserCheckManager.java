package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.business.abstracts.UserCheckService;
import eTrade.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println(" İsim girmek zorunludur.");
			return false;
		} else {
			if (user.getFirstName().length() < 3) {
				System.out.println(" İsim en az 3 karakterli olmali");
				return false;
			}
		}
		return true;

	}

	@Override
	public boolean checkLastname(User user) {
		if (user.getLastName().isEmpty()) {
			System.out.println(" Soy isim girmek zorunludur.");
			return false;
		} else {
			if (user.getLastName().length() < 3) {
				System.out.println(" Soyisim en az 3 karakterli olmali");
				return false;
			}
		}
		return true;

	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		boolean result = matcher.matches();

		if (user.geteMail().isEmpty()) {
			System.out.println(" E-mail girmek zorunludur.");
			return false;
		} else {
			if (result == false) {
				System.out.println(user.geteMail() + " Girilen mail adresi formata uygun degil.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println(" Sifre bos birakilamaz.");
			return false;
		} else {
			if (user.getPassword().length() < 6) {
				System.out.println(" Parola en az 6 karakter olmali");
				return false;
			}
		}
		return true;

	}

}