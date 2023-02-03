<div class="page_account" id="account_login">
  <div class="warp">
    <div class="container">
      <div class="row">
        <div class="col-12 col-md-6">
          <div class="card">
            <!-- 登录 -->
            <div class="form_login">
              <b-form>
                <b-form-group id="input-group-1" label="username:" label-for="input-1" :state="validation_username"
                  invalid-feedback="账户名长度为在5-16个字符" valid-feedback="校验通过">
                  <b-form-input id="input-1" v-model="form.username" type="text" placeholder="用户名" trim></b-form-input>
                </b-form-group>

                <b-form-group id="input-group-2" label="password:" label-for="input-2" :state="validation_password"
                  invalid-feedback="密码长度为在5-16个字符" valid-feedback="校验通过">
                  <b-form-input id="input-2" v-model="form.password" type="password" placeholder="密码" trim
                    autocomplete="off"></b-form-input>
                </b-form-group>
                <div class="btns_bottom">
                  <div class="btn_item" @click="submit()">登录</div>
                  <div class="forgot_nav" @click="$router.push('/account/forgot')">
                    忘记密码
                  </div>
                </div>
              </b-form>
            </div>
          </div>
        </div>
        <div class="col-12 col-md-6">
          <div class="card">
            <!-- 创建一个账户 -->
            <div class="more_nav">
              <div style="text-align: center; margin-bottom: 20px">
                没有账户?
              </div>
              <div class="btn_item" @click="$router.push('/account/register')">
                创建一个账户
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>