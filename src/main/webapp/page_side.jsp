<el-menu class="side el-menu-vertical-demo" default-active="/" @open="handleOpen" @close="handleClose"
  background-color="#545c64" text-color="#fff" active-text-color="#38f" :collapse="isCollapse" :router="true">
  <el-menu-item index="/">
    <i class="el-icon-s-home"></i>
    <span slot="title"></span>
  </el-menu-item>
  <el-submenu index="web"
    v-show="user_group == '管理员' || $check_group(['/nav/table','/link/table','/notice/table','/slides/table','/ad/table','/message/table'])">
    <template slot="title"><i class="el-icon-data-board"></i><span></span></template>
    <el-menu-item v-show="user_group == '' || $check_action('/auth/table')" index="/auth/table">
				<span></span>
			</el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/link/table')" index="/link/table">
				<span></span>
			</el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/slides/table')" index="/slides/table">
      <span></span>
    </el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/ad/table')" index="/ad/table">
				<span></span>
			</el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/notice/table')" index="/notice/table">
      <span></span>
    </el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/message/table')" index="/message/table">
      <span></span>
    </el-menu-item>
  </el-submenu>

  <el-submenu index="user"
    v-show="user_group == '' || $check_group(['/user/table','/user_group/table','/auth/table'])">
    <template slot="title"><i class="el-icon-user-solid"></i><span></span></template>
    <el-menu-item index="/user/table"><span></span></el-menu-item>
    <el-menu-item index="/user_group/table"><span></span></el-menu-item>
  </el-submenu>
  <el-submenu index="content"
    v-show="user_group == '' || $check_group(['/forum/table','/forum_type/table','/article/table','/article_type/table'])">
    <template slot="title"><i class="el-icon-chat-line-round"></i><span></span></template>
    <el-menu-item v-show="user_group == '' || $check_action('/forum/table')" index="/forum/table">
      <span></span>
    </el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/forum_type/table')" index="/forum_type/table">
      <span></span>
    </el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/article/table')" index="/article/table">
      <span></span>
    </el-menu-item>
    <el-menu-item v-show="user_group == '' || $check_action('/article_type/table')" index="/article_type/table">
      <span></span></el-menu-item>
  </el-submenu>
  <el-submenu index="mall" v-show="user_group == '' || $check_group(['/goods/table','/order/table'])">
    <template slot="title"><i class="el-icon-s-goods"></i><span></span></template>
    <el-menu-item v-show="user_group == '' || $check_action('/goods/table')" index="/goods/table" class="bg-hover">
      <span>{{$page_title("/goods/table") || ""}}</span></el-menu-item>

    <el-menu-item v-show="user_group == '' || $check_action('/goods_type/table')" index="/goods_type/table"
      class="bg-hover"><span>{{$page_title("/goods_type/table") || ""}}</span></el-menu-item>

    <el-menu-item v-show="user_group == '' || $check_action('/order/table')" index="/order/table" class="bg-hover">
      <span>{{$page_title("/order/table") || "订单"}}</span></el-menu-item>
  </el-submenu>

  <el-submenu index="more" v-show="auth.length">
    <template slot="title"><i class="el-icon-copy-document"></i><span></span></template>
    <el-menu-item v-for="(o, idx) in auth" v-show="$check_action(o.path)" :index="o.path">
      <span>{{o.page_title}}</span>
    </el-menu-item>
  </el-submenu>
</el-menu>