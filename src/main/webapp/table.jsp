<el-main class="bg">
  <el-form label-position="right" :model="query" class="form p_4" label-width="120">
    <el-row>
      <el-col :xs="24" :sm="24" :lg="8">
        <el-form-item label="">
          <el-input v-model="query.name"></el-input>
        </el-form-item>
      </el-col>
      <el-col :xs="24" :sm="24" :lg="24">
        <el-col :xs="24" :sm="12" :lg="12">
          <el-form-item>
            <el-button type="primary" @click="search()">查询</el-button>
            <el-button @click="reset()">重置</el-button>
          </el-form-item>
        </el-col>
        <el-col :xs="24" :sm="12" :lg="12">
          <el-form-item>
            <el-button v-if="user_group == '管理员' || $check_action('/goods_type/table','del')" class="float-right"
              type="danger" @click="delInfo()">删除</el-button>
            <router-link v-if="user_group == '管理员' || $check_action('/goods_type/view')"
              class="el-button float-right el-button--default el-button--primary" to="./view?">添加
            </router-link>
          </el-form-item>
        </el-col>
      </el-col>
    </el-row>
  </el-form>

  <el-table border :data="list" @selection-change="selectionChange" style="width: 100%">

    <!-- 多选按钮 -->
    <el-table-column fixed type="selection" tooltip-effect="dark" width="55">
    </el-table-column>
    <!-- /多选按钮 -->

    <el-table-column fixed label="" prop="name" width="120">
    </el-table-column>

    <el-table-column label="图标" prop="icon" min-width="100">
      <template slot-scope="scope">
        <el-image style="width: 100px; height: 100px" :src="$fullUrl(scope.row.icon)"
          :preview-src-list="[$fullUrl(scope.row.icon)]">
          <div slot="error" class="image-slot">
            <img src="/img/error.png" style="width: 90px; height: 90px" />
          </div>
        </el-image>
      </template>
    </el-table-column>

    <el-table-column label="描述" prop="desc" min-width="80">
    </el-table-column>

    <el-table-column sortable prop="create_time" label="创建时间" min-width="200">
      <template slot-scope="scope">
        {{ $toTime(scope.row["create_time"],"yyyy-MM-dd hh:mm:ss") }}
      </template>
    </el-table-column>

    <el-table-column sortable prop="update_time" label="更新时间" min-width="200">
      <template slot-scope="scope">
        {{ $toTime(scope.row["update_time"],"yyyy-MM-dd hh:mm:ss") }}
      </template>
    </el-table-column>

    <!-- 操作 -->
    <el-table-column fixed="right" label="操作" width="80">
      <template slot-scope="scope">
        <router-link class="el-button el-button--small is-plain el-button--primary"
          :to="'./view?' + field + '=' + scope.row[field]" size="small">编辑</router-link>
      </template>
    </el-table-column>
    <!-- /操作 -->

  </el-table>

  <!-- 分页器 -->
  <div class="mt text_center">
    <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange" :current-page="query.page"
      :page-sizes="[7, 10, 30, 100]" :page-size="query.size" layout="total, sizes, prev, pager, next, jumper"
      :total="count">
    </el-pagination>
  </div>
  <!-- /分页器 -->

</el-main>