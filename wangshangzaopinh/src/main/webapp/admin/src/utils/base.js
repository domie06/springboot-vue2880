const base = {
    get() {
        return {
            url : "http://localhost:8080/wangshangzaopinh/",
            name: "wangshangzaopinh",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wangshangzaopinh/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上招聘系统"
        } 
    }
}
export default base
