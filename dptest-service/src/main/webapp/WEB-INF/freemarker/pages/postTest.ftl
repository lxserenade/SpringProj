<#import "defaultlayout.ftl" as layout/>

<#import "spring.ftl" as spring />
<@spring.bind "PicPostData" />

<@layout.layout>

<section class="content">
<form id="ppd" method="POST" action="/getPostData" name="PicPostData">
    <table>

        <tr>
            <td>picId</td>
            <td><input name="picId" value="${PicPostData.picId}"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>
    </section>

</@layout.layout>