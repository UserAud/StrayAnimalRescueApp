package com.example.strayanimalrescueapp.ui.login;

import android.widget.EditText;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.util.Patterns;

import com.example.strayanimalrescueapp.data.LoginRepository;
import com.example.strayanimalrescueapp.data.Result;
import com.example.strayanimalrescueapp.data.model.LoggedInUser;
import com.example.strayanimalrescueapp.R;

public class LoginViewModel extends ViewModel {



    private MutableLiveData<com.example.strayanimalrescueapp.ui.login.LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<com.example.strayanimalrescueapp.ui.login.LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    LiveData<com.example.strayanimalrescueapp.ui.login.LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<com.example.strayanimalrescueapp.ui.login.LoginResult> getLoginResult() {
        return loginResult;
    }

    public void login(String username, String password, String name) {
        // can be launched in a separate asynchronous job
        Result<LoggedInUser> result = loginRepository.login(username, password);

        if (result instanceof Result.Success) {
            LoggedInUser data = ((Result.Success<LoggedInUser>) result).getData();
            loginResult.setValue(new com.example.strayanimalrescueapp.ui.login.LoginResult(new LoggedInUserView(data.getDisplayName(name))));
        } else {
            loginResult.setValue(new com.example.strayanimalrescueapp.ui.login.LoginResult(R.string.login_failed));
        }
    }

    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new com.example.strayanimalrescueapp.ui.login.LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new com.example.strayanimalrescueapp.ui.login.LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new com.example.strayanimalrescueapp.ui.login.LoginFormState(true));
        }
    }

    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}