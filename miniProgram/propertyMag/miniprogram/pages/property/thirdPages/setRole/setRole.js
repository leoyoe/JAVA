// miniprogram/pages/systemMag/powMag/powerMag.js
var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    activeKey: 0,
    inputShowed: false,
    inputVal: "",
    checkboxItems_role: [],
    setRoleUserId: "",
    selectRoleidArr: [],
    parentPage: "",//parentPage为1，表示审核通过直接授权
  },



  //复选框
  checkboxChange: function (e) {
    var targetObj = e.target.dataset.obj;
    var checkboxItems = this.data[targetObj], values = e.detail.value;
    
    for (var i = 0, lenI = checkboxItems.length; i < lenI; ++i) {
      checkboxItems[i].checked = false;

      for (var j = 0, lenJ = values.length; j < lenJ; ++j) {
        if (checkboxItems[i].value == values[j]) {
          checkboxItems[i].checked = true;
          break;
        }
      }
    }

    this.setData({
      [targetObj]: checkboxItems
    });
  },

  //查询数据
  loadData: function(){
    var that = this;
    // 显示加载图标
    wx.showLoading({
      title: '玩命加载中',
    });
    wx.request({
      url: app.globalData.HTTP_REQUEST_URL+'/property/index.php/IndexController/getRoleList', //仅为示例，并非真实的接口地址
      data: {
        
      },
      header: {
        "Content-Type": "application/x-www-form-urlencoded",
        'cookie': wx.getStorageSync("sessionid")
      },
      method: "POST",
      success(res) {
        wx.hideLoading();//关闭遮罩
        //res.data.data = JSON.parse(JSON.stringify(res.data.data).trim());
        var retData = res.data.data;
        console.log(retData);
        var chkArr = [];
        if (retData.length > 0){
          for (var i = 0; i < retData.length;i++){
            var tmpretObj = {};
            //console.log(that.data.selectRoleidArr + "===" + retData[i].id + "===" + that.data.selectRoleidArr.indexOf(retData[i].id));
            if (that.data.selectRoleidArr.indexOf(retData[i].id) != -1){
              tmpretObj = {
                "name": retData[i].rolename,
                "value": retData[i].id,
                "checked": true
              }
            }else{
              tmpretObj = {
                "name": retData[i].rolename,
                "value": retData[i].id
              }
            }
            chkArr.push(tmpretObj);
          }
          that.setData({
            checkboxItems_role: chkArr
          })
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(options);
    var that = this;
    //parentPage为1，表示审核通过后直接授权,控制授权结束后刷新哪个父页面
    if(options.parentPage){
      that.setData({
        parentPage: options.parentPage
      });
    }

    that.setData({
      setRoleUserId: options.id
    });

    if (options.roleid) {
      that.setData({
        selectRoleidArr: JSON.parse(options.roleid)
      })
    }
  },


  //确认授权
  doSetRole: function () {
    var that = this;
    var checkboxItems = that.data.checkboxItems_role;
    var selected = [];//当前选择到的值
    for (var i = 0; i < checkboxItems.length; i++) {
      if (checkboxItems[i].checked == true) {
        selected.push(checkboxItems[i].value);
      }
    }
    console.log(selected);
    // 显示加载图标
    wx.showLoading({
      title: '请稍等',
    });

    wx.request({
      url: app.globalData.HTTP_REQUEST_URL+'/property/index.php/UserController/updateUserStatus', //仅为示例，并非真实的接口地址
      data: {
        id: that.data.setRoleUserId,
        roleid: JSON.stringify(selected),
      },
      header: {
        "Content-Type": "application/x-www-form-urlencoded",
        'cookie': wx.getStorageSync("sessionid")
      },
      method: "POST",
      success(res) {
        console.log(res);
        wx.hideLoading();//关闭遮罩

        if (res.data.status == 1){
          wx.showToast({
            title: '授权成功',
            icon: 'success',
            duration: 1000,
            success: function(){
              setTimeout(function(){
                var t;
                if(that.data.parentPage){
                  //返回两级页面
                  t = getCurrentPages()[getCurrentPages().length - 3];
                  t.loadInitData();
                  //跳两级
                  wx.navigateBack({
                    delta: 2
                  })
                }else{
                  //返回一级
                  t = getCurrentPages()[getCurrentPages().length - 2];
                  t.loadInitData();
                  wx.navigateBack({
                    
                  })
                }
              }, 1000);
            }
          });
        }else{
          wx.showToast({
            title: '授权失败，错误信息：'+res.msg,
            icon: 'none',
            duration: 1000
          });
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    this.loadData();
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})