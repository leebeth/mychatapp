package com.example.leebethanacona.mychatapp.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.leebethanacona.mychatapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter loginPresenter;
    @BindView(R.id.tEmail)
    EditText email;
    @BindView(R.id.tPassword)
    EditText password;
    @BindView(R.id.bSignIn)
    Button bSignIn;
    @BindView(R.id.bSignUp)
    Button bSignUp;
    @BindView(R.id.progressBar)
    ProgressBar progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenterImpl(this);
    }
}
