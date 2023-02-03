<el-main class="bg">
  <el-form ref="form" :model="form" status-icon label-width="70px">

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="avatar">
        <el-upload class="avatar-uploader" drag accept="image/gif, image/jpeg, image/png, image/jpg" action=""
          :http-request="uploadImg" :show-file-list="false">
          <img v-if="form.img" :src="$fullUrl(form.img)" class="avatar">
          <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="avatar">
        <el-upload class="avatar-uploader" drag accept="image/gif, image/jpeg, image/png, image/jpg" action=""
          :http-request="uploadImg_1" :show-file-list="false">
          <img v-if="form.img_1" :src="$fullUrl(form.img_1)" class="avatar">
          <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="avatar">
        <el-upload class="avatar-uploader" drag accept="image/gif, image/jpeg, image/png, image/jpg" action=""
          :http-request="uploadImg_2" :show-file-list="false">
          <img v-if="form.img_2" :src="$fullUrl(form.img_2)" class="avatar">
          <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="avatar">
        <el-upload class="avatar-uploader" drag accept="image/gif, image/jpeg, image/png, image/jpg" action=""
          :http-request="uploadImg_3" :show-file-list="false">
          <img v-if="form.img_3" :src="$fullUrl(form.img_3)" class="avatar">
          <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="avatar">
        <el-upload class="avatar-uploader" drag accept="image/gif, image/jpeg, image/png, image/jpg" action=""
          :http-request="uploadImg_4" :show-file-list="false">
          <img v-if="form.img_4" :src="$fullUrl(form.img_4)" class="avatar">
          <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="avatar">
        <el-upload class="avatar-uploader" drag accept="image/gif, image/jpeg, image/png, image/jpg" action=""
          :http-request="uploadImg_5" :show-file-list="false">
          <img v-if="form.img_5" :src="$fullUrl(form.img_5)" class="avatar">
          <i v-else class="el-icon-plus avatar-uploader-icon"></i>
        </el-upload>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="12">
      <el-form-item label="" prop="title">
        <el-input v-model="form.title" placeholder=""></el-input>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="12">
      <el-form-item label="" prop="description">
        <el-input v-model="form.description" placeholder=""></el-input>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="price_ago">
        <el-input-number v-model="form.price_ago"></el-input-number>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="price">
        <el-input-number v-model="form.price"></el-input-number>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="hits">
        <el-input-number v-model="form.hits" placeholder=""></el-input-number>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="sales">
        <el-input-number v-model="form.sales" placeholder=""></el-input-number>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="type">
        <el-select v-model="form.type">
          <el-option v-for="(o ,i) in list_goods_type" :value="o.name" :key="i" :label="o.name"></el-option>
        </el-select>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="12" :lg="8">
      <el-form-item label="" prop="inventory">
        <el-input-number v-model="form.inventory" placeholder=""></el-input-number>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="24" :lg="24">
      <el-form-item label="" prop="content">
        <quill-editor v-model="form.content">
        </quill-editor>
      </el-form-item>
    </el-col>

    <el-col :xs="24" :sm="24" :lg="24">
      <el-form-item>
        <el-col :xs="24" :sm="24" :lg="12">
          <el-button style="width: 100%; float: left;" type="primary" @click="submit()">提交</el-button>
        </el-col>
        <el-col :xs="24" :sm="24" :lg="12">
          <el-button style="width: 100%; float: right;" @click="cancel()">取消</el-button>
        </el-col>
      </el-form-item>
    </el-col>

  </el-form>
</el-main>